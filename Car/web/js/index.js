$(function () {
    $("#div").hide();
    $("#btn").click(function () {
        alert("ok");
        $("#div").show(1000);
    })
    $("#all").click(function (e) {
        var s=this.checked;
        //alert($(".cek").length);
        $(".cek").each(function (v,i) {
            i.checked=s;
        })
    });
    $("#reload").click(function (e) {
        form1.action="Car_Query";
    })
})