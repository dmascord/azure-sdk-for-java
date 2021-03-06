/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ContainerServiceOchestratorTypes.
 */
public enum ContainerServiceOchestratorTypes {
    /** Enum value Swarm. */
    SWARM("Swarm"),

    /** Enum value DCOS. */
    DCOS("DCOS"),

    /** Enum value Custom. */
    CUSTOM("Custom"),

    /** Enum value Kubernetes. */
    KUBERNETES("Kubernetes");

    /** The actual serialized value for a ContainerServiceOchestratorTypes instance. */
    private String value;

    ContainerServiceOchestratorTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ContainerServiceOchestratorTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ContainerServiceOchestratorTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static ContainerServiceOchestratorTypes fromString(String value) {
        ContainerServiceOchestratorTypes[] items = ContainerServiceOchestratorTypes.values();
        for (ContainerServiceOchestratorTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
