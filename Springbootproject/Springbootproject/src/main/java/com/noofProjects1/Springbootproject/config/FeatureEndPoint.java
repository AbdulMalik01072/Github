package com.noofProjects1.Springbootproject.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Component
@Endpoint(id= "features ")
public class FeatureEndPoint {

    private final Map<String, Taskbar.Feature> featureMap =
            new ConcurrentHashMap<>();

  }

