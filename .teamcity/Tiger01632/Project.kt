package Tiger01632

import Tiger01632.buildTypes.*
import Tiger01632.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01632")
    name = "Tiger01632"

    vcsRoot(Tiger01632_cVCSroot)

    buildType(Tiger01632_Hi3)
    buildType(Tiger01632_Hi2)
    buildType(Tiger01632_Hi1)
    buildType(Tiger01632_Hi0)
})
