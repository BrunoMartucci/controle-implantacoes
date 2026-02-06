package config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SecurityConfig {

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().permitAll()
//                );
//
//        return http.build();
//    }

    //    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())
//                .cors(cors -> cors.disable())
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/auth/login").permitAll()
//                        .anyRequest().authenticated()
//                );
//
//        return http.build();
//    }
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                        .allowedOrigins("http://127.0.0.1:5500") // origem do seu front
//                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                        .allowCredentials(true);
//            }
//
//            @Bean
//            public PasswordEncoder passwordEncoder() {
//                return new BCryptPasswordEncoder();
//            }
//
//            @Autowired
//            private PasswordEncoder passwordEncoder;
//
//            @PostConstruct
//            public void gerarSenha() {
//                System.out.println("HASH GERADO:");
//                System.out.println(passwordEncoder.encode("123456"));
//            }
//        };
//    }
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Permite que o frontend no Live Server faça requisições
                registry.addMapping("/**")
                        .allowedOrigins("http://127.0.0.1:5500") // URL do frontend
                        .allowedMethods("*"); // GET, POST, PUT, DELETE, OPTIONS...
            }
        };
    }
};
