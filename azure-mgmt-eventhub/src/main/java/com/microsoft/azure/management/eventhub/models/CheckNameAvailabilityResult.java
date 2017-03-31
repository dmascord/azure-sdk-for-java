/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.eventhub.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of a Check Name availability request properties.
 */
public class CheckNameAvailabilityResult {
    /**
     * Value indicating namespace is availability, true if the namespace is
     * available; otherwise, false.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /**
     * The reason for unavailability of a namespace. Possible values include:
     * 'None', 'InvalidName', 'SubscriptionIsDisabled', 'NameInUse',
     * 'NameInLockdown', 'TooManyNamespaceInCurrentSubscription'.
     */
    @JsonProperty(value = "reason")
    private UnavailableReason reason;

    /**
     * The detailed info regarding the reason associated with the namespace.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get the nameAvailable value.
     *
     * @return the nameAvailable value
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable value.
     *
     * @param nameAvailable the nameAvailable value to set
     * @return the CheckNameAvailabilityResult object itself.
     */
    public CheckNameAvailabilityResult withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public UnavailableReason reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the CheckNameAvailabilityResult object itself.
     */
    public CheckNameAvailabilityResult withReason(UnavailableReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}