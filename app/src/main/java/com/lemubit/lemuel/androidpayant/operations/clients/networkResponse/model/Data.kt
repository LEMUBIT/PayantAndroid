package com.lemubit.lemuel.androidpayant.operations.clients.networkResponse.model

/**
 * @author lemuel
 */
class Data {
    val company_id: String? = null
    val name: String? = null
    val first_name: String? = null
    val last_name: String? = null
    val email: String? = null
    val phone: String? = null
    val website: String? = null
    val address: String? = null
    val type: String? = null
    val settlement_bank: String? = null
    val account_name: String? = null
    val account_number: String? = null
    val status: String? = null
    val created_at: String? = null
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
