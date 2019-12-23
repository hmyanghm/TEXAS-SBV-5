<template>
	<div>
		<h1>로그인 화면</h1>
		<v-app>
			<v-card width="400" class="mx-auto mt-5">
			<v-card-title class="pb-0">
				<h1>Login</h1>
			</v-card-title>
			<v-card-text>
				<v-form>
				<v-text-field
					label="Username"
					prepend-icon="mdi-account-circle"
				/>
				<v-text-field
					:type="showPassword ? 'text' : 'password'"
					label="Password"
					prepend-icon="mdi-lock"
					:append-icon="showPassword ? 'mdi-eye' : 'mdi-eye-off'"
					@click:append="showPassword = !showPassword"
				/>
				</v-form>
			</v-card-text>
			<v-divider></v-divider>
			<v-card-actions>
				<v-btn color="success">Register</v-btn>
				<v-btn color="info">Login</v-btn>
			</v-card-actions>
			</v-card>
		</v-app>
	</div>
</template>
<script>
export default {
	data () {
		return {
			showPassword: false
		}
	}
}
</script>
<style scoped>

</style>