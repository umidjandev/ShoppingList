package com.najdimu.shoppinglist.data.repositories

import com.najdimu.shoppinglist.data.db.entities.ShoppingItem
import com.najdimu.shoppinglist.data.db.ShoppingDatabase

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}