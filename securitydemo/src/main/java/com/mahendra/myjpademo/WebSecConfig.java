package com.mahendra.myjpademo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/", "/home","/index.html").permitAll()
                .antMatchers("/admin").hasRole("admin")
                .antMatchers("/emp").hasAnyRole("admin","emp")
                .anyRequest().authenticated()
                .and()
           
            .logout()
                .permitAll();
    }
    
  @Override
  protected UserDetailsService userDetailsService() {
	  UserDetails user1 = User.withDefaultPasswordEncoder()
			  			.username("lex")
			  			.password("pass1234")
			  			.roles("admin")
			  			.build();
	  UserDetails user2 = User.withDefaultPasswordEncoder()
	  			.username("max")
	  			.password("pass1234")
	  			.roles("emp")
	  			.build();
	  UserDetails user3 = User.withDefaultPasswordEncoder()
	  			.username("tom")
	  			.password("pass1234")
	  			.roles("emp")
	  			.build();

	  List<UserDetails> users = new LinkedList<>();
	  users.add(user1);
	  users.add(user2);
	  users.add(user3);
	  return new InMemoryUserDetailsManager(users);
  }

}