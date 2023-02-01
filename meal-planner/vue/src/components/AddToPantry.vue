<template>
    <div id="AddToPantry">
        <h2 id="pantry-header">My Pantry</h2>
        <div id="types">
        <input type="text" placeholder="Type Ingredient Here">
        <button v-on:click.prevent="saveIngredient()" type="submit" class="button">Add Ingredient</button>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            ingredients: [
                {
                name: "broccoli"
                },
                {
                    name: "milk"
                },
            ]
        };
    },
    methods: {

}
};
</script>

<style>
#types{
    display: flex;
}
#AddToPantry{
    background: white;
}
#pantry-header {
    text-align: center;
}
</style>