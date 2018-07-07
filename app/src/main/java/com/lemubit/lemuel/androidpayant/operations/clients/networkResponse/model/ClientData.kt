package com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.model

/**
 * @author lemuel
 */
open class ClientData {
    @get:JvmName("getCompanyId")
     val company_id: String? = null

    val name: String? = null
    @get:JvmName("getFirstName")
    val first_name: String? = null

    @get:JvmName("getLastName")
    val last_name: String? = null

    val email: String? = null

    val phone: String? = null

    val website: String? = null

    val address: String? = null

    val type: String? = null

    @get:JvmName("getSettlementBank")
    val settlement_bank: String? = null

    @get:JvmName("getAccountName")
    val account_name: String? = null

    @get:JvmName("getAccountNumber")
    val account_number: String? = null

    val status: String? = null

    @get:JvmName("getTimeCreated")
    val created_at: String? = null

    @get:JvmName("getTimeUpdated")
    val updated_at: String? = null

    val id: String? = null

    override fun toString(): String {
        return "Data{" +
                "company_id='" + company_id + '\''.toString() +
                ", name='" + name + '\''.toString() +
                ", first_name='" + first_name + '\''.toString() +
                ", last_name='" + last_name + '\''.toString() +
                ", email='" + email + '\''.toString() +
                ", phone='" + phone + '\''.toString() +
                ", website='" + website + '\''.toString() +
                ", address='" + address + '\''.toString() +
                ", type='" + type + '\''.toString() +
                ", settlement_bank='" + settlement_bank + '\''.toString() +
                ", account_name='" + account_name + '\''.toString() +
                ", account_number='" + account_number + '\''.toString() +
                ", status='" + status + '\''.toString() +
                ", created_at='" + created_at + '\''.toString() +
                ", updated_at='" + updated_at + '\''.toString() +
                ", id='" + id + '\''.toString() +
                '}'.toString()
    }
}
