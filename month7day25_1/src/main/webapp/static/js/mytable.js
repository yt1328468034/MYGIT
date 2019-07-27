/* table组件
          需要提供:
        headlist对象 格式=>
        {list:[{title:"列头名(比如 编号、姓名等)",key:"字段名(比如 id、name)"}],primary_key:"主键名(比如 id)"} ;
        pageinfo对象 格式=>就是父级的分页对象
          对应的方法:
                    获取数据  getdata(currentPage'要查看的页码', pageSize'每页数量') ;
                    修改数据  modifydata(obj'要修改的对象') ;     
                    删除数据  removedata(primary_key'主键即删除依据') ;  
 * */
		Vue.component("mytable", {
			name: "temptable",
			props: ['headlist', 'pageinfo'],
			template: '\
		<table class="table table-hover table-striped  text-center">\
			<thead>\
				<tr>\
					<th v-for="h in headlist.list">\
						{{h.title}}\
					</th>\
					<th>操作</th>\
				</tr>\
			</thead>\
			<tbody>\
				<tr v-for="d in pageinfo.list">\
					<td v-for="h in headlist.list">\
						{{d[h.key]}}\
					</td>\
					<td>\
						<a title="查看详情"><span class="glyphicon glyphicon-list-alt"></span></a>\
						<a title="修改" @click="modifydata(d)" onclick="showWindowDialog(\'modify.html\',\'修改\')"><span class="glyphicon glyphicon-edit"></span>\
						</a>\
						<a title="删除" @click="removedata(d[headlist.primary_key])"><span class="glyphicon glyphicon-trash"></span></a>\
					</td>\
				</tr>\
			</tbody>\
			<tfoot>\
				<tr>\
					<td :colspan="headlist.list.length | colspan" class="text-center">\
						<a class="btn btn-default" @click="getdata(1,pageinfo.pageSize)">首页</a> \
						<a class="btn btn-default" @click="getdata(pageinfo.prePage=hasPreviousPage?pageinfo.prePage:1,pageinfo.pageSize)">上一页</a>\
						<a class="btn btn-default" @click="getdata(pageinfo.nextPage=hasNextPage?pageinfo.nextPage:pageinfo.pages,pageinfo.pageSize)">下一页</a>\
						<a class="btn btn-default" @click="getdata(pageinfo.pages,pageinfo.pageSize)">末页</a>\
					</td>\
				</tr>\
			</tfoot>\
		</table>\
			',
			methods:{
				/*组件获取数据的方法 传递到父级*/
				getdata: function(currentPage, pageSize) {
					this.$emit("getdata",currentPage,pageSize);
				},
				/*组件修改数据的方法 传递到父级*/
				modifydata:function(obj){
					this.$emit("modifydata",obj);
				},
				/*组件修改数据的方法 传递到父级*/
				removedata:function(primary_key){
					this.$emit("removedata",primary_key);
				}
			},
			filters:{
				/*尾部分页栏的跨列过滤*/
				colspan:function(val){
					return parseInt(val)+1;
				}
			}

		});