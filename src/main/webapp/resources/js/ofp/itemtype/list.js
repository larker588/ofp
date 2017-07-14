var dtGridColumns = [{
    id : 'itemtypeid',
    title : '编号',
    type : 'number',
    columnClass : 'text-center',
    headerClass : 'dlshouwen-grid-header'
}, {
    id : 'itemtypename',
    title : '物料名称',
    type : 'string',
    columnClass : 'text-center',
    headerClass : 'dlshouwen-grid-header'
}, {
    id : 'itemtypecreatetime',
    title : '创建时间',
    type : 'date',
    format : 'yyyy-MM-dd hh:mm:ss',
    otype:'string', 
    oformat:'yyyy-MM-dd hh:mm:ss',
    columnClass : 'text-center',
    headerClass : 'dlshouwen-grid-header',
    hideType : 'sm|xs'
}];
var dtGridOption = {
    lang : 'zh-cn',
    ajaxLoad : true,
    extraWidth : '37px',
    loadURL : sys.rootPath + '/itemtype/list.html',
    columns : dtGridColumns,
    gridContainer : 'dtGridContainer',
    toolbarContainer : 'dtGridToolBarContainer',
    tools : 'refresh|print',
    exportFileName : '产品大类信息',
    pageSize : 10,
    pageSizeLimit : [10, 20, 30]
};
var grid = $.fn.dlshouwen.grid.init(dtGridOption);
$(function() {
    grid.load();
    $("#btnSearch").click(customSearch);
    
    //注册回车键事件
    document.onkeypress = function(e){
    var ev = document.all ? window.event : e;
        if(ev.keyCode==13) {
            customSearch();
        }
    };
    
});

//自定义查询
function customSearch() {
    grid.parameters = new Object();
    grid.parameters['itemtypename'] = $("#searchKey").val();
    grid.refresh(true);
}
