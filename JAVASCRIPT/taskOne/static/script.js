let person = prompt("Lütfen adınızı ve soyadınızı yazınız!", "");

if (person != null) {
    document.getElementById("myName").innerHTML =
    person;
  }

function updateClock() {
    var now = new Date();
    var dname = now.getDay(),
        mo = now.getMonth(),
        dnum = now.getDate(),
        yr = now.getFullYear(),
        hou = now.getHours(),
        min = now.getMinutes();

    Number.prototype.pad = function (digits) {
        for (var n = this.toString(); n.length < digits; n = 0 + n) ;
        return n;
    }

    var months = ["Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"];
    var week = ["Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"];
    var ids = ["dayname", "month", "daynum", "year", "hour", "minutes"];
    var values = [week[dname], months[mo], dnum.pad(2), yr, hou.pad(2), min.pad(2)];

    for (var i = 0; i < ids.length; i++) {
        document.getElementById(ids[i]).firstChild.nodeValue = values[i];
    }


}

function initClock() {
    updateClock();
    window.setInterval("updateClock()", 1)
}