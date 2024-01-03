//package apigateway.com.apigateway.routeAndResilience4jConfig;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
////import org.springframework.security.oauth2.core.OAuth2AccessToken;
//import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
//
//import java.util.Optional;
//
//public class AccessTokenProvider {
//
//    private static Optional<OAuth2AuthenticationDetails> currentOAuth2Details() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication != null && OAuth2AuthenticationDetails.class.isAssignableFrom(authentication.getDetails().getClass())) {
//            return Optional.of((OAuth2AuthenticationDetails) authentication.getDetails());
//        }
//
//        return Optional.empty();
//    }
//
//    public static String provideToken() {
//        Optional<OAuth2AuthenticationDetails> currentOAuth2Details = currentOAuth2Details();
//        
//        return currentOAuth2Details.map(OAuth2AuthenticationDetails::getTokenValue).orElse(null);
//    }
//}
