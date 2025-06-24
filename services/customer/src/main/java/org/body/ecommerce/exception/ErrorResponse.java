package org.body.ecommerce.exception;

import java.util.HashMap;

public record ErrorResponse (
        HashMap<String, String> errors
) {}
