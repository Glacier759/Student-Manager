$("#toggle").click(function (event) {
    event.preventDefault(), $(this).find(".top").toggleClass("active"), $(this).find(".middle").toggleClass("active"), $(this).find(".bottom").toggleClass("active"), $("#overlay").toggleClass("open")
});