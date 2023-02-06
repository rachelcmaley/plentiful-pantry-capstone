<template>
    <div class="my-pantry">
        <div id="space">  </div>
        <h2 id="pantry">My Pantry</h2>
        <div id="space"> </div>
        <ul>
            <li>eggs</li>
            <div id="underline"> </div>
            <li>apples</li>
             <div id="underline"> </div>
            <li>pears</li>
             <div id="underline"> </div>
            <li>tortillas</li>
             <div id="underline"> </div>
            <li>beans</li>
             <div id="underline"> </div>
            <li>oranges</li>
             <div id="underline"> </div>
            <li>cucumber</li>
             <div id="underline"> </div>
            <li>meat</li>
             <div id="underline"> </div>
        </ul>
    </div>
</template>

<style>
.my-pantry{
    border: solid green 3px;
    background: white;
    border-radius: 10px;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-size: 20px;
}

#underline{
    border-bottom: solid 2px rgb(164, 162, 236);
    margin-right: 90px;
}

#pantry{
    text-align: center;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    color: green;
}

#paperLine{
    border-left: solid rgb(25, 25, 129) 2px;
    margin-left: 10px;
}

li{
    margin-left: 50px;
}

#space{
    padding-top: 15px;
}

</style>