package com.wire.android.ui.userprofile.self

import com.wire.android.model.UserStatus
import com.wire.android.ui.userprofile.self.SelfUserProfileViewModel.ErrorCodes
import com.wire.android.ui.userprofile.self.dialog.StatusDialogData
import com.wire.android.ui.userprofile.self.model.OtherAccount

data class SelfUserProfileState(
    val avatarAssetByteArray: ByteArray? = null,
    val errorMessageCode: ErrorCodes? = null,
    val status: UserStatus = UserStatus.AVAILABLE,
    val fullName: String = "",
    val userName: String = "",
    val teamName: String? = "", // maybe teamId is better here
    val otherAccounts: List<OtherAccount> = emptyList(),
    val statusDialogData: StatusDialogData? = null, // null means no dialog to display
    val isAvatarLoading: Boolean = false
)