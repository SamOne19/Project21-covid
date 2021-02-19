package com.samone.project21

data class Response(
    val statewise: List<StatewiseItem?>? = null
)

data class StatewiseItem(
    val recovered: String? = null,
    val deltadeaths: String? = null,
    val migratedother: String? = null,
    val deltarecovered: String? = null,
    val active: String? = null,
    val deltaconfirmed: String? = null,
    val state: String? = null,
    val statecode: String? = null,
    val confirmed: String? = null,
    val deaths: String? = null,
    val lastupdatedtime: String? = null
)