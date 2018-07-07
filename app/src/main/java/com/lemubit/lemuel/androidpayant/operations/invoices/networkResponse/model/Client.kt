package com.lemubit.lemuel.androidpayant.operations.invoices.networkResponse.model

import com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.model.ClientData

/**
 * @author lemuel
 */
class Client : ClientData() {
    @get:JvmName("getTimeDeleted")
    val deleted_at: String? = null

    override fun toString(): String {
        return super.toString() + " ClientDeletion{" +
                "deleted_at='" + deleted_at + '\''.toString() +
                '}'.toString()
    }
}
