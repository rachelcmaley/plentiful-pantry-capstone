<template>
    <div id="healthInfo">
        <h1 id="resourcesTitle"> Resources</h1>

        <div id="resourcesOne">
            <a href="https://www.nhs.uk/live-well/healthy-weight/managing-your-weight/ten-weight-loss-myths/" id="stuff"> Managing Your Weight Responsibly </a> 
            <div id="space"></div>
            <a href="https://www.healthline.com/health/fitness/how-to-gain-muscle" id="stuff"> How To Gain Muscle </a>
            <div id="space"></div>
            <a href="https://www.businessinsider.com/scientific-reasons-to-eat-healthy-2016-7" id="stuff"> Eating Healthier </a>
        </div>
        <div id ="resourcesTwo">
            <a href="https://www.healthline.com/nutrition/ketogenic-diet-101" id="stuff"> A Detailed Beginner’s Guide to Keto </a>
            <div id="space"></div>
            <a href="https://www.webmd.com/diet/ss/slideshow-what-happens-when-you-stop-eating-carbs" id="stuff"> What Happens When You Stop Eating Carbs </a>
            <div id="space"></div>
            <a href="https://www.eatingwell.com/article/7827792/no-sugar-diet-plan/" id="stuff"> No Sugar Diet Plan</a>
        </div>

    </div>
</template>


<script>


export default {
    data() {
        return{
        }
    },
}
</script>

<style >

#healthInfo{
    display: grid;
    grid-template-columns: 1fr 1fr;
    grid-template-areas:
    "title title" 
    "p1 p2"
    "p1 p2";
    
   
    width:1010px;
    height:450px;
    margin-left: 130px;
    /* background-color: rgb(211, 255, 211); */
    border: solid green 4px;
    border-radius: 30px;
    margin-bottom: 40px;
    background-color: white;
}

#a1{
    background-color: white;
}

#resourcesTitle{
    grid-area: title;
    text-align: center;
    color: green;
    padding-top: 10px;
}

#stuff{
}

#resourcesOne{
    grid-area: p1;
    font-size: 25px;
    padding-left: 40px;

}

#resourcesTwo{
    grid-area: p2;
    font-size: 25px;
    padding-left: 40px;
}
</style>