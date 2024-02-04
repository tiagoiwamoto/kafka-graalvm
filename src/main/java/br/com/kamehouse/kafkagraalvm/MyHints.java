package br.com.kamehouse.kafkagraalvm;

import org.springframework.aot.hint.ExecutableMode;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;

public class MyHints implements RuntimeHintsRegistrar {
    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        // Register method for reflection
//        Method method = ReflectionUtils.findMethod(KameCert.class, "deserialize", String.class, Byte.class);
//        hints.reflection().registerMethod(method, ExecutableMode.INVOKE);

        // Register resources
//        hints.resources().registerPattern("my-resource.txt");

        // Register serialization
//        hints.serialization().registerType(TypeReference.of(KameCert.class));
//
//        // Register proxy
//        hints.proxies().registerJdkProxy(KameCert.class);
    }
}
