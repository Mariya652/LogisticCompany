package com.informatics.LogisticCompany.config;

import com.informatics.LogisticCompany.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@AllArgsConstructor
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationSecurityConfiguration extends WebSecurityConfigurerAdapter {



	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors().disable().csrf().disable();

//		http.cors().disable().csrf().disable().authorizeRequests()
//				.antMatchers("/js/**", "/css/**").permitAll()
//				.antMatchers("/", "/customers/register", "/users/login").anonymous().anyRequest().authenticated()
//				.and()
//				.formLogin().loginPage("/login").usernameParameter("username").passwordParameter("password")
//				.defaultSuccessUrl("/home").and().logout().logoutSuccessUrl("/");

	}

}
