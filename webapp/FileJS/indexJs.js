function showrap() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/movie/rap",
        //xử lý khi thành công
        success: function (data) {
            let str = "";
            for (let i = 0; i < data.length; i++) {
                str += "<div class=\"product\" style=\"height: 300px\">"
                str += `<div><button type="submit"><img src="${data[i].imgFilm}" height="250px"></button></div>`
                str += `<div style="width: 170px;white-space: nowrap; overflow: hidden;text-overflow: clip"><a href="Fiml-details.html?id=${data[i].idFilm}">${data[i].nameFilm}</a></div>`
                str += `<div>${data[i].year}</div>`
                str += "</div>"
            }
            document.getElementById("body1").innerHTML = str;
        },
        error: function (err) {
            console.log(err)
        }
    })
}

showrap();


function showanime() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/movie/anime",
        //xử lý khi thành công
        success: function (data) {
            let str = "";
            for (let i = 0; i < data.length; i++) {
                str += "<div class=\"product\" style=\"height: 300px\">"
                str += `<div><a href="Fiml-details.html"><button type="submit"><img src="${data[i].imgFilm}" height="250px"></button></a></div>`
                str += `<div style="width: 170px;white-space: nowrap; overflow: hidden;text-overflow: clip">${data[i].nameFilm}</div>`
                str += `<div>${data[i].year}</div>`
                str += "</div>"
            }

            document.getElementById("body").innerHTML = str;
        },
        error: function (err) {
            console.log(err)
        }
    })
}

showanime();


function showkinhdi() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/movie/action",
        //xử lý khi thành công
        success: function (data) {
            let str = "";
            for (let i = 0; i < data.length; i++) {
                str += "<div class=\"product\" style=\"height: 300px\">"
                str += `<div><a href="Fiml-details.html"><button type="submit"><img src="${data[i].imgFilm}" height="250px"></button></a></div>`
                str += `<div style="width: 170px;white-space: nowrap; overflow: hidden;text-overflow: clip">${data[i].nameFilm}</div>`
                str += `<div>${data[i].year}</div>`
                str += "</div>"
            }


            document.getElementById("body2").innerHTML = str;
        },
        error: function (err) {
            console.log(err)
        }
    })
}

showkinhdi();


function showlehot() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/movie/le",
        //xử lý khi thành công
        success: function (data) {
            let str = "";
            for (let i = 0; i < data.length; i++) {
                str += "<div class=\"product\" style=\"height: 200px\">"
                str += `<div style="float: left"><a href="Fiml-details.html"><img src="${data[i].imgFilm}" height="200px" width="150px"></a></div>`
                str += `<div style="width: 170px;white-space: nowrap; overflow: hidden;text-overflow: clip">${data[i].nameFilm}</div>`
                str += `<div>${data[i].year}</div>`
                str += "</div>"
            }

            document.getElementById("body3").innerHTML = str;
        },
        error: function (err) {
            console.log(err)
        }
    })
}

showlehot();


function showbohot() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/movie/bo",
        //xử lý khi thành công
        success: function (data) {
            let str = "";
            for (let i = 0; i < data.length; i++) {
                str += "<div class=\"product\" style=\"height: 200px\">"
                str += `<div style="float: left"><a href="Fiml-details.html"><img src="${data[i].imgFilm}" height="200px" width="150px"></a></div>`
                str += `<div style="width: 170px;white-space: nowrap; overflow: hidden;text-overflow: clip">${data[i].nameFilm}</div>`
                str += `<div>${data[i].year}</div>`
                str += "</div>"
            }

            document.getElementById("body4").innerHTML = str;
        },
        error: function (err) {
            console.log(err)
        }
    })
}

showbohot();

