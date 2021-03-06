/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.network.implementation.LoadBalancersInner;
import com.microsoft.azure.management.network.implementation.NetworkManager;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsBatchDeletion;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsListingByGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;


/**
 * Entry point to load balancer management API in Azure.
 */
@Fluent()
@Beta
public interface LoadBalancers extends
    SupportsCreating<LoadBalancer.DefinitionStages.Blank>,
    SupportsListing<LoadBalancer>,
    SupportsListingByGroup<LoadBalancer>,
    SupportsGettingByGroup<LoadBalancer>,
    SupportsGettingById<LoadBalancer>,
    SupportsDeletingById,
    SupportsDeletingByGroup,
    SupportsBatchCreation<LoadBalancer>,
    SupportsBatchDeletion,
    HasManager<NetworkManager>,
    HasInner<LoadBalancersInner> {
}
