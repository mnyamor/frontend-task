/*jshint -W117 */
var gvar = gvar || {
  initDone: false,
  photosApi:'/api/photos',
  init: function() {
    if (gvar.initDone === false) {
      console.log(' **** starting intitalization **** ');
      gvar.fetchPhotoData();
      gvar.animateToDiv();
    } else {
     console.log('intitalization done');
     gvar.initDone = true;
    }
  },
  
  /**
   * Fetch data from /api/photos
   * @returns photo url, photo title
   **/
  
  fetchPhotoData: function() { 
    console.log(' **** fetching data **** ');
    $.get( gvar.photosApi, function( data ) {
      var a, b;
      for (a = 0, b = data.length; a < b; a++) {
        if (data) {
          console.log(data);
          gvar.loadPhotos( data[a].url, data[a].title);
        }
      }
    });
  },
  
  /**
   * Create photos template
   **/
  
  loadPhotos: function(imageURL, imageTitle) {
     var doc = document,
      holder = doc.getElementById('photos'),
      tmp = [];

     var wrapper = doc.createElement('div');
      wrapper.className = 'custom-margin col-xs-6 col-sm-3 col-md-3 col-lg-2';

      tmp[tmp.length] ='<div class="ratio img-responsive img-circle" style="background-image: url('+imageURL+');"></div>'+
      '<h4 class="photo-title text-center text-uppercase">'+ imageTitle +'</h4>';
      wrapper.innerHTML = tmp.join('');
      tmp.length = 0;

      holder.appendChild(wrapper);


  },
  /**
   * Animate anchor link
   **/
  animateToDiv: function() {
    $('a[href*="#"]:not([href="#"])').click(function() {
      if (location.pathname.replace(/^\//,'') === this.pathname.replace(/^\//,'') && location.hostname === this.hostname) {
        var target = $(this.hash);
        target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
        if (target.length) {
          $('html, body').animate({
            scrollTop: target.offset().top
          }, 1000);
          return false;
        }
      }
    });
  }
};


$(document).ready(function(){
  gvar.init();
});


//GET /api/photos
// Some jQuery
// $(document).ready(function(){
//   $('.photo img').each(function(e){
//     $(this).css('border','2px solid '+getRandomColor() + '');
//   });

// });
// function getRandomColor() {
//   var letters = '0123456789ABCDEF'.split('');
//   var color = '#';
//   for (var i = 0; i < 6; i++ ) {
//     color += letters[Math.floor(Math.random() * 16)];
//   }
//   return color;
// }