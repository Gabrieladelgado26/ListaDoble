
document.addEventListener("DOMContentLoaded", function() {
  let radios = document.querySelectorAll('input[type=radio]');
  let count = 0;

  radios.forEach(function(radio) {
    radio.addEventListener('click', function() {
      if (this.checked) {
        if (this.value === 'opcion1' || this.value === 'opcion2') {
          if (count < 2) {
            document.getElementById('inputValue').style.display = 'block';
            count++;
          } else {
            this.checked = false;
          }
        } else {
          document.getElementById('inputValue').style.display = 'none';
          count--;
        }
      }
    });
  });
});