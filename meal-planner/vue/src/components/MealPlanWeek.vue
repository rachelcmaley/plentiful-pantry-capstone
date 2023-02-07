<template>

  <div id="weekly-grid">
    <div>
      <h2 class="day" id="sunday">Sunday</h2>
        <div id="line">
          <p  id="fSu">Breakfast meal</p>
          <p id="sSu">Lunch Meal</p>
          <p id="tSu">Dinner Meal</p>
        </div>
    </div>
    <div>
      <h2 class="day" id="monday">Monday</h2>
        <div id="line">
            <p id="fMo">Breakfast Meal</p>
            <p id="sMo">Lunch Meal</p>
            <p id="tMo">Dinner Meal</p>
        </div>
    </div>
    <div >
        <h2 class="day" id="tuesday">Tuesday</h2>
          <div id="line">
            <p id="fTu">Breakfast Meal</p>
            <p id="sTu">Lunch Meal</p>
            <p id="tTu">Dinner Meal</p>
          </div>
    </div>
    <div >
      <h2 class="day" id="wednesday">Wednesday</h2>
        <div id="line"> 
          <p id="fWe">Breakfast Meal</p>
          <p id="sWe">Lunch Meal</p>
          <p id="tWe">Dinner Meal</p>
         </div>
    </div>
    <div >
      <h2 class="day" id="thursday">Thursday</h2>
          <div id="line">
            <p id="fTh">Breakfast Meal</p>
            <p id="sTh">Lunch Meal</p>
            <p id="tTh">Dinner Meal</p>
          </div>
    </div>
    <div >
      <h2 class="day" id="friday">Friday</h2>
          <div id="line">
          <p id="fFr">Breakfast Meal</p>
          <p id="sFr">Lunch Meal</p>
          <p id="tFr">Dinner Meal</p>
          </div>
    </div>
    <div>
      <h2 class="day" id="saturday">Saturday</h2>
      <p id="fSa">Breakfast Meal</p>
      <p id="sSa">Lunch Meal</p>
      <p id="tSa">Dinner Meal</p>
    </div>
  </div>
</template>


<style>

/*
      Grid names are broken into two parts
      the first letter signifies if its the First Second or Third meal. F, S, or T.
      The last two letters are the first two letters of the day of the week.

      for example,  
      *F* irst    *Su* nday = fSu
      *S* second  *Mo* nday = sMo
  */



#fSu {grid-area: fSu;
}
#sSu {
  grid-area: sSu;
}
#tSu {
  grid-area: tSu;
}
#fMo{
  grid-area: fMo;
}
#sMo{
  grid-area: sMo;
}
#tMo{
  grid-area: tMo;
}
#fTu {
  grid-area: fTu;
}
#sTu {
  grid-area: sTu;
  
}
#tTu {
  grid-area: tTu;
}
#fWe {
  grid-area: fWe;
}
#sWe {
  grid-area: sWe;
}
#tWe {
  grid-area: tWe;
}
#fTh {
  grid-area: fTh;
}
#sTh {
  grid-area: sTh;
  
}
#tTh {
  grid-area: tTh;
}
#fFr {
  grid-area: fFr;
}
#sFr {
  grid-area: sFr;
  
}
#tFr{
  grid-area: tFr;
}
#fSa {
  grid-area: fSa;
}
#sSa {
  grid-area: sSa;
}
#tSa {
  grid-area: tSa;
}
#sunday{
  grid-area: sunday;
  color:rgb(255, 140, 211);
}
#monday{
  grid-area: monday;
  color: rgb(255, 93, 241);
}
#tuesday{
  grid-area: tuesday;
  color: rgb(255, 30, 218);
}
#wednesday{
  grid-area: wednesday;
  color: rgb(215, 0, 138);
}
#thursday{
  grid-area: thursday;
  color: rgb(179, 0, 65);
}
#friday{
  grid-area: friday;
  color:rgb(135, 0, 9);
}
#saturday{
  grid-area: saturday;
  color: rgb(109, 7, 7);
}

.day{
  font-weight: bold;
  text-align: center;
  border-bottom: solid rgb(95, 156, 95) 3px;
}

#line{
  border-right: solid rgb(180, 180, 180) 3px;
}

p{
  text-align: center;
}

#weekly-grid {
 background-color: white;
 border: solid rgb(95, 156, 95) 3px;
 font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
 border-radius: 20px;
 padding: 45px 20px 30px 20px;
 font-size: 20px;
 display: grid;
 height: 280px;
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr 1fr;

  grid-template-areas:
    "sunday monday tuesday wednesday thursday friday saturday"
    "fSu fMo fTu fWe fTh fFr fSa"
    "sSu sMo sTu sWe sTh sFr sSa"
    "tSu tMo tTu tWe tTh tFr tSa";
}


</style>