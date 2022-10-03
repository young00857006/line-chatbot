function show_all_funiture() {
    var Merchant = sessionStorage.getItem('Merchant');
    var url = "";
    $("#Merchant_list").html("");
    /*$.getJSON(url,function(result){
        $.each(result,function(index,value){
            var insertHTML = "";
            insertHTML += `
            <tr id = "first">
                        <td>
                            <span class="custom-checkbox">
                                <input type="checkbox" id="checkbox1" name="options[]" value="1">
                                <label for="checkbox1"></label>
                            </span>
                        </td>
                        <td>Thomas Hardy</td>
                        <td>thomashardy@mail.com</td>
                        <td>89 Chiaroscuro Rd, Portland, USA</td>
                        <td>(171) 555-2222</td>
                        <td>(171) 555-2222</td>
                        <td>
                            <a id = "swe" href="#editEmployeeModal" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                            <a href="#deleteEmployeeModal" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                        </td>
                    </tr>
            </tr>
            `;
            $("#Merchant_list").append(insertHTML);
        });
    });*/
}
function delete_funiture(fid, sid) {

}
function edit_funiture(click_item) {
    console.log("edit");
    console.log(click_item.parents("tr")[0].id);
}
function post_funiture() {//新增家具
    var obj = {};
    obj["u_id"] = $("#post_u_id").val();
    obj["d_id"] = $("#post_d_id").val();
    obj["address"] = $("#post_address").val();
    obj["url"] = $("#post_url").val();
    obj["name"] = $("#post_name").val();
    obj["site"] = $("#post_site").val();
    console.log(obj);

}
$("document").ready(function () {

    console.log("start");
    //將供應商填入列表
    $("#post_confirm_btn").click(function () {
        post_funiture();
        location.reload();
    });

    $(".edit").click(function (e) {
        var click_item = $(e.target).parents("tr").children('td');
        console.log(click_item.eq(1).text());
        $("#edit_u_id").val(click_item.eq(1).text());
        $("#edit_d_id").val(click_item.eq(2).text());
        $("#edit_address").val(click_item.eq(3).text());
        $("#edit_url").val(click_item.eq(4).text());
        $("#edit_name").val(click_item.eq(5).text());
        $("#edit_site").val(click_item.eq(6).text());
        $.each(click_item.parents("td"), function (index, value) {
            console.log(value.text());
        });
        $("#edit_save_btn").click(function () {
            edit_funiture(click_item)
        });
    });
    $(".delete").click(function (e) {
        var click_item = $(e.target);

        console.log(click_item.parents("tr")[0].id);
        $("#delete_confirm_btn").click(function () {
            edit_funiture(click_item)
        });
    });
    $(".search-box").focusout(function () {
        console.log($("#search_val").val());
    });
    $("#sign_out_btn").click(function () {
        if (confirm('您是否要登出') == true) {
            $(window).attr('location', 'index.html');
        }
    });
});