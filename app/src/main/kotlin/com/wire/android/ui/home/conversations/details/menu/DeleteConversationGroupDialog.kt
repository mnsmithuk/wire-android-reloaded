package com.wire.android.ui.home.conversations.details.menu

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.wire.android.R
import com.wire.android.ui.common.VisibilityStateExt
import com.wire.android.ui.common.WireDialog
import com.wire.android.ui.common.WireDialogButtonProperties
import com.wire.android.ui.common.WireDialogButtonType
import com.wire.android.ui.common.button.WireButtonState
import com.wire.android.ui.common.visbility.VisibilityState

@Composable
internal fun DeleteConversationGroupDialog(
    dialogState: VisibilityState,
    isLoading: Boolean,
    conversationName: String,
    onDeleteGroup: () -> Unit,
) {
    VisibilityStateExt(dialogState) {
        WireDialog(
            title = stringResource(id = R.string.delete_group_conversation_dialog_title, conversationName),
            text = stringResource(id = R.string.delete_group_conversation_dialog_description),
            buttonsHorizontalAlignment = true,
            onDismiss = dialogState::dismiss,
            dismissButtonProperties = WireDialogButtonProperties(
                onClick = dialogState::dismiss,
                text = stringResource(id = R.string.label_cancel),
                state = WireButtonState.Default
            ),
            optionButton1Properties = WireDialogButtonProperties(
                onClick = { onDeleteGroup() },
                text = stringResource(id = R.string.label_remove),
                type = WireDialogButtonType.Primary,
                state =
                if (isLoading)
                    WireButtonState.Disabled
                else
                    WireButtonState.Error,
                loading = isLoading
            )
        )
    }
}