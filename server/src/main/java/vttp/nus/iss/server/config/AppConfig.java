package vttp.nus.iss.server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;

@Configuration
public class AppConfig {

    // // ? REDIS
    // @Value("${spring.redis.host}")
    // private String redistHost;

    // @Value("${spring.redis.port}")
    // private int redisPort;

    // @Value("${spring.redis.database}")
    // private int redisDatabase;

    // @Bean("quote")
    // public RedisTemplate<String, String> createRedisTemplate() {
    //     final RedisStandaloneConfiguration config = new RedisStandaloneConfiguration(redisHost, redisPort);
    //     config.setDatabase(redisDatabase);

    //     final JedisClientConfiguration jedisClient = JedisClientConfiguration.builder()
    //             .build();
    //     final JedisConnectionFactory jedisFac = new JedisConnectionFactory(config, jedisClient);
    //     jedisFac.afterPropertiesSet();

    //     final RedisTemplate<String, String> template = new RedisTemplate<>();
    //     template.setConnectionFactory(jedisFac);
    //     template.setKeySerializer(new StringRedisSerializer());
    //     template.setValueSerializer(new StringRedisSerializer());
    //     template.setHashKeySerializer(new StringRedisSerializer());
    //     template.setHashValueSerializer(new StringRedisSerializer());
    //     return template;
    // }

    // // ? AMAZONs3
    // @Value("${spaces.secret.key}")
    // private String spacesSecretKey;

    // @Value("${spaces.access.key}")
    // private String spacesAccessKey;

    // @Value("${spaces.endpoint.url}")
    // private String spacesEndpointUrl;

    // @Value("${spaces.endpoint.region}")
    // private String spacesRegion;

    // @Bean
    // public AmazonS3 createS3Client() {
    //     BasicAWSCredentials cred = new BasicAWSCredentials(spacesAccessKey, spacesSecretKey);
    //     EndpointConfiguration epConfig = new EndpointConfiguration(spacesEndpointUrl, spacesRegion);

    //     return AmazonS3ClientBuilder.standard()
    //             .withEndpointConfiguration(epConfig)
    //             .withCredentials(new AWSStaticCredentialsProvider(cred))
    //             .build();
    // }

}
