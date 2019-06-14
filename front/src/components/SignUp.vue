<template>
    <form>
        <v-text-field
                v-model="name"
                label="name"
        >
        </v-text-field>
        <v-text-field
                v-model="password"
                label="password"
        >

        </v-text-field>
        <v-btn @click="submit">
            登録
        </v-btn>
    </form>
</template>

<script>
    import axios from 'axios'

    export default {
        data() {
            return{
                name: "",
                password: "",
                headers: {
                    'Content-Type': 'application/json;charset=UTF-8',
                    'Access-Control-Allow-Origin': '*'
                }
            }
        },
        methods: {
            submit: async function() {
                console.log(this.name)
                console.log(this.password)
                const header = {
                    'X-Requested-With': 'XMLHttpRequest'
                }
                const data = {
                    name: this.name,
                    password: this.password
                }
                const res = axios.post('/api/v1/sign_up', data, { headers: header})

                console.log(res)
                //
            }
        }
    }





</script>
