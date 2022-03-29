package com.wire.android.ui.authentication.create.team

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.wire.android.ui.authentication.create.code.CreateAccountCodeScreen
import com.wire.android.ui.authentication.create.details.CreateAccountDetailsScreen
import com.wire.android.ui.authentication.create.email.CreateAccountEmailScreen
import com.wire.android.ui.authentication.create.overview.CreateAccountOverviewScreen
import com.wire.android.ui.authentication.create.summary.CreateAccountSummaryScreen
import com.wire.kalium.logic.configuration.ServerConfig

enum class CreateTeamNavigationItem(val route: String, val content: @Composable (ContentParams) -> Unit) {
    Overview("create_team_overview_screen", { CreateAccountOverviewScreen(it.viewModel, it.serverConfig) }),
    Email("create_team_email_screen", { CreateAccountEmailScreen(it.viewModel, it.serverConfig) }),
    Details("create_team_details_screen", { CreateAccountDetailsScreen(it.viewModel, it.serverConfig) }),
    Code("create_team_code_screen", { CreateAccountCodeScreen(it.viewModel, it.serverConfig) }),
    Summary("create_personal_account_summary_screen", { CreateAccountSummaryScreen(it.viewModel) })
}

data class ContentParams(val viewModel: CreateTeamViewModel, val serverConfig: ServerConfig)

internal fun navigateToItemInCreateTeam(navController: NavController, item: CreateTeamNavigationItem) {
    navController.navigate(item.route)
}