/*! -v1.0 项目描述  By Linyer */
layui.use(["layer", "datatable", "datatableButton", "datatableFlash", "datatableHtml5", "datatablePrint", "datatableColVis", "datatableSelect"],
    function() {
        var t = layui.jquery,
            e = layui.layer;
        t.fn.dataTableExt.oSort["chinese-asc"] = function(t, e) {
            return t.localeCompare(e)
        },
            t.fn.dataTableExt.oSort["chinese-desc"] = function(t, e) {
                return e.localeCompare(t)
            },
            t.fn.dataTableExt.aTypes.push(function(t) {
                var e = /^[\u4e00-\u9fa5]{0,}$/;
                return e.test(t) ? "chinese": null
            }),
            t(document).ready(function() {
                var e = t("#userTable").DataTable({
                    processing: !0,
                    stateSave: !0,
                    scrollCollapse: !0,
                    paginationType: "full_numbers",
                    language: lang,
                    autoWidth: !1,
                    lengthMenu: [15, 30, 50],
                    stripeClasses: ["odd", "even"],
                    searching: !0,
                    paging: !0,
                    lengthChange: !0,
                    info: !0,
                    order: [1, "desc"],
                    aoColumnDefs: [{
                        orderable: !1,
                        aTargets: [0, 10]
                    }],
                    deferRender: !0,
                    ajax: "/user/findAll",
                    columns: [{
                        data: function(t) {
                            return '<input type="checkbox" class="fly-checkbox" name="sublist" data-id=' + t.id + ">"
                        },
                        sTitle: "<input type='checkbox' class='btn-checkall fly-checkbox'>",
                        sDefaultContent: ""
                    },
                        {
                            data: "id",
                            sTitle: "ID",
                            sDefaultContent: ""
                        },
                        {
                            data: function(t) {
                                return '<u class="btn-showuser">' + t.userName + "</u>"
                            },
                            sTitle: "用户名",
                            sType: "chinese",
                            sDefaultContent: ""
                        },
                        {
                            data: "userSex",
                            sTitle: "性别",
                            sType: "chinese",
                            sDefaultContent: ""
                        },
                        {
                            data: function(t) {
                                return "&nbsp;" + t.phone + "&nbsp;"
                            },
                            sTitle: "手机号码",
                            sDefaultContent: ""
                        },
                        {
                            data: function(t) {
                                return "&nbsp;" + t.identity + "&nbsp;"
                            },
                            sTitle: "身份证号码",
                            sDefaultContent: ""
                        },
                        {
                            data: "email",
                            sTitle: "邮箱",
                            sDefaultContent: ""
                        },
                        {
                            data: "address",
                            sTitle: "地址",
                            sType: "chinese",
                            sDefaultContent: ""
                        },
                        {
                            data: function(t) {
                                return replaceTime(t.joinTime / 1e3)
                            },
                            sTitle: "加入时间",
                            sDefaultContent: ""
                        },
                        {
                            data: function(t) {
                                return t.status ? '<span class="label label-success radius">已启用</span>': '<span class="label label-default radius">已停用</span>'
                            },
                            className: "td-status",
                            sTitle: "状态",
                            sDefaultContent: ""
                        },
                        {
                            data: function(t) {
                                return t.status ? '<span title="停用" class="handle-btn handle-btn-stop"><i class="linyer icon-zanting"></i></span><span title="编辑" class="handle-btn handle-btn-edit"><i class="linyer icon-edit"></i></span><span title="修改密码" class="handle-btn handle-btn-updatepwd"><i class="linyer icon-xgpwd2"></i></span><span title="删除" class="handle-btn handle-btn-delect"><i class="linyer icon-delect"></i></span>': '<span title="启用" class="handle-btn handle-btn-run"><i class="linyer icon-qiyong"></i></span><span title="编辑" class="handle-btn handle-btn-edit"><i class="linyer icon-edit"></i></span><span title="修改密码" class="handle-btn handle-btn-updatepwd"><i class="linyer icon-xgpwd2"></i></span><span title="删除" class="handle-btn handle-btn-delect"><i class="linyer icon-delect"></i></span>'
                            },
                            className: "td-handle",
                            sTitle: "操作",
                            sDefaultContent: ""
                        }]
                });
                t.fn.dataTable.Buttons.swfPath = "../../js/lib/dataTables/extensions/Buttons/swf/flashExport.swf",
                    t.fn.dataTable.Buttons.defaults.dom.container.className = "tableTools-box",
                    new t.fn.dataTable.Buttons(e, {
                        buttons: [{
                            extend: "colvis",
                            text: "<i class='linyer icon-search'></i> <span class='hidden'>显示/隐藏列</span>",
                            className: "layui-btn table-tool",
                            columns: ":not(:first):not(:last)"
                        },
                            {
                                extend: "copy",
                                text: "<i class='linyer icon-copy'></i> <span class='hidden'>复制到剪贴板</span>",
                                className: "layui-btn table-tool"
                            },
                            {
                                extend: "csv",
                                text: "<i class='linyer icon-exports'></i> <span class='hidden'>导出csv</span>",
                                className: "layui-btn table-tool"
                            },
                            {
                                extend: "excel",
                                text: "<i class='linyer icon-excel'></i> <span class='hidden'>导出excel</span>",
                                className: "layui-btn table-tool"
                            },
                            {
                                extend: "pdf",
                                text: "<i class='linyer icon-pdf'></i> <span class=''>导出pdf</span>",
                                className: "layui-btn table-tool"
                            },
                            {
                                extend: "print",
                                text: "<i class='linyer icon-print'></i> <span class='hidden'>打印</span>",
                                className: "layui-btn table-tool",
                                autoPrint: !1,
                                message: "此打印是使用DataTable的打印按钮生成的!"
                            }]
                    }),
                    e.buttons().container().appendTo(t(".tableTools"));
                var n = e.button(0).action();
                e.button(0).action(function(e, a, s, l) {
                    n(e, a, s, l),
                    0 == t(".dt-button-collection > .dropdown-menu").length && t(".dt-button-collection").wrapInner('<ul class="dropdown-menu" />').find("a").attr("href", "javascript:;").wrap("<li />"),
                        t(".dt-button-collection").appendTo(".tableTools-box")
                });
                var a = e.button(1).action();
                e.button(1).action(function(t, e, n, s) {
                    a(t, e, n, s)
                });
                var s = 0;
                e.on("select",
                    function(n, a, l, i) {
                        "row" === l && (t(e.row(i).node()).find("input:checkbox").prop("checked", !0), s = t(e.row(i).node()).find("input.fly-checkbox:checkbox").data("id"), console.log(s))
                    }),
                    t("#ssss").on("click",
                        function() {
                            var n = e;
                            t(t(e).context[0].nTBody).find("tr.selected");
                            console.log(n)
                        }),
                    e.on("deselect",
                        function(n, a, s, l) {
                            "row" === s && t(e.row(l).node()).find("input:checkbox").prop("checked", !1)
                        }),
                    t(document).on("click", "#userTable > thead > tr > th input[type=checkbox],#userTable > tfoot > tr > th input[type=checkbox]",
                        function() {
                            var n = this.checked;
                            t("#userTable").find("tbody > tr").each(function() {
                                var t = this;
                                n ? e.row(t).select() : e.row(t).deselect()
                            })
                        }),
                    t(document).on("click", "#userTable tbody td input[type=checkbox]",
                        function() {
                            var n = t(this).closest("tr").get(0);
                            this.checked ? e.row(n).select() : e.row(n).deselect()
                        }),
                    t(document).on("click", "#userTable tbody td",
                        function() {
                            t(this).closest("tr").get(0)
                        })
            }),
            t("#userTable").on("click", ".btn-showuser",
                function() {
                    var e = t(this).html(),
                        n = "user-show.html";
                    layer_show(e, n, "", "400", "500")
                }),
            t("#btn-adduser").on("click",
                function() {
                    var e = t(this).html(),
                        n = "user-add.html";
                    layer_show(e, n, "", "800", "600")
                }),
            t(".table-sort").on("click", ".handle-btn-stop",
                function() {
                    var n = t(this);
                    e.confirm("确认要停用吗？", {
                            icon: 0,
                            title: "警告",
                            shade: !1
                        },
                        function(a) {
                            t(n).parents("tr").find(".td-handle").prepend('<span class="handle-btn handle-btn-run" title="启用"><i class="linyer icon-qiyong"></i></span>'),
                                t(n).parents("tr").find(".td-status").html('<span class="label label-default radius">已停用</span>'),
                                t(n).remove(),
                                e.msg("已停用!", {
                                    icon: 5,
                                    time: 1e3
                                })
                        })
                }),
            t(".table-sort").on("click", ".handle-btn-run",
                function() {
                    var n = t(this);
                    e.confirm("确认要启用吗？", {
                            icon: 0,
                            title: "警告",
                            shade: !1
                        },
                        function(a) {
                            t(n).parents("tr").find(".td-handle").prepend('<span class="handle-btn handle-btn-stop" title="停用"><i class="linyer icon-zanting"></i></span>'),
                                t(n).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>'),
                                t(n).remove(),
                                e.msg("已启用!", {
                                    icon: 6,
                                    time: 1e3
                                })
                        })
                }),
            t(".table-sort").on("click", ".handle-btn-edit",
                function() {
                    t(this);
                    layer_show("编辑", "user-edit.html", "", "800", "600")
                }),
            t(".table-sort").on("click", ".handle-btn-updatepwd",
                function() {
                    t(this);
                    layer_show("编辑", "user-updatepwd.html", "", "600", "500")
                }),
            t(".table-sort").on("click", ".handle-btn-delect",
                function() {
                    var n = t(this);
                    n.parents("tr").find("td:first-child input").data("id");
                    e.confirm("确认要删除吗？", {
                            icon: 0,
                            title: "警告",
                            shade: !1
                        },
                        function(a) {
                            t(n).parents("tr").remove(),
                                e.msg("已删除!", {
                                    icon: 1,
                                    time: 1e3
                                })
                        })
                }),
            t("#btn-delect-all").on("click",
                function() {
                    console.log(t(".table-sort tbody :checkbox:checked").length),
                        0 == t(".table-sort tbody :checkbox:checked").length ? e.msg("请选择需要删除的数据！", {
                            icon: 0
                        }) : e.confirm("确认要删除吗？", {
                                icon: 0,
                                title: "警告",
                                shade: !1
                            },
                            function(n) {
                                t(".table-sort tbody :checkbox:checked").parents("tr").remove(),
                                    e.msg("已删除!", {
                                        icon: 1,
                                        time: 1e3
                                    })
                            })
                })
    });