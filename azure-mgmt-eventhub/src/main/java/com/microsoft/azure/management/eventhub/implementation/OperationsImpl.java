/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.eventhub.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.management.eventhub.Operations;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.eventhub.models.OperationListResult;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Operations.
 */
public class OperationsImpl implements Operations {
    /** The Retrofit service to perform REST calls. */
    private OperationsService service;
    /** The service client containing this operation class. */
    private EventHubManagementClientImpl client;

    /**
     * Initializes an instance of Operations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsImpl(Retrofit retrofit, EventHubManagementClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.eventhub.Operations list" })
        @GET("providers/Microsoft.EventHub/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion);

    }

    /**
     * Lists all of the available event hub REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationListResult object if successful.
     */
    public OperationListResult list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Lists all of the available event hub REST API operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationListResult> listAsync(final ServiceCallback<OperationListResult> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lists all of the available event hub REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationListResult object
     */
    public Observable<OperationListResult> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<OperationListResult>, OperationListResult>() {
            @Override
            public OperationListResult call(ServiceResponse<OperationListResult> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all of the available event hub REST API operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationListResult object
     */
    public Observable<ServiceResponse<OperationListResult>> listWithServiceResponseAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationListResult>>>() {
                @Override
                public Observable<ServiceResponse<OperationListResult>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationListResult> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationListResult> listDelegate(Response<ResponseBody> response) throws RestException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationListResult, RestException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationListResult>() { }.getType())
                .build(response);
    }

}
