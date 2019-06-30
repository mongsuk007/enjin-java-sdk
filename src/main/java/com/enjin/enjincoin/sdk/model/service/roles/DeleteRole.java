package com.enjin.enjincoin.sdk.model.service.roles;

import com.enjin.enjincoin.sdk.graphql.GraphQLRequest;

public class DeleteRole extends GraphQLRequest<DeleteRole> {

    public DeleteRole id(int id) {
        withParameter("id", id);
        return this;
    }

    public DeleteRole name(String name) {
        withParameter("name", name);
        return this;
    }

}
