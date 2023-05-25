package com.eazybytes.springsecOAUTH2GitHub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecOAUTH2GitHubConfig {

	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().anyRequest().authenticated().and().oauth2Login();
		return http.build();
	}

//	@Bean
//	public ClientRegistrationRepository clientRepository() {
//		ClientRegistration clientReg = clientRegistration();
//		return new InMemoryClientRegistrationRepository(clientReg);
//	}
//
//	private ClientRegistration clientRegistration() {
//		return CommonOAuth2Provider.GITHUB.getBuilder("github").clientId("8c5a70bf0d07e4789d03")
//				.clientSecret("aa3a0991c7be7bcfbdefb3d7a4de4e7b3fca69f2").build();
//	}
}
