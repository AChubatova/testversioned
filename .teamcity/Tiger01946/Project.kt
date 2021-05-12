package Tiger01946

import Tiger01946.buildTypes.*
import Tiger01946.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01946")
    name = "Tiger01946"

    vcsRoot(Tiger01946_cVCSroot)

    buildType(Tiger01946_Hi3)
    buildType(Tiger01946_Hi2)
    buildType(Tiger01946_Hi1)
    buildType(Tiger01946_Hi0)
})
