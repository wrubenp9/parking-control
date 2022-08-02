package com.api.parkingcontrol.core.domain.exception;

import lombok.*;

@Builder
public record Errors(int code, String message) {}
