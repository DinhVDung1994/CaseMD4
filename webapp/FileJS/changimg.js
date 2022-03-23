let index = 1;
function changimg() {
    console.log(index)
    index++;
    if (index > 5) {
        index = 1;
    }
    document.getElementById('picture').src = "imgWeb/imgbaner/img" + index + ".jpg"
}
function run() {
    setInterval(changimg, 2000)
}
run();