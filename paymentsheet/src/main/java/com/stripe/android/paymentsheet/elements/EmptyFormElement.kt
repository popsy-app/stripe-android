package com.stripe.android.paymentsheet.elements

import com.stripe.android.paymentsheet.forms.FormFieldEntry
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow

internal data class EmptyFormElement(
    override val identifier: IdentifierSpec = IdentifierSpec.Generic("empty_form"),
    override val controller: Controller? = null,
) : FormElement() {
    override fun getFormFieldValueFlow(): Flow<List<Pair<IdentifierSpec, FormFieldEntry>>> =
        MutableStateFlow(emptyList())
}
