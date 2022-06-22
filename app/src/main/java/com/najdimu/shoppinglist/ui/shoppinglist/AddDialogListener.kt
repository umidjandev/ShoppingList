package com.najdimu.shoppinglist.ui.shoppinglist

import com.najdimu.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}