package Tiger01337

import Tiger01337.buildTypes.*
import Tiger01337.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01337")
    name = "Tiger01337"

    vcsRoot(Tiger01337_cVCSroot)

    buildType(Tiger01337_Hi0)
    buildType(Tiger01337_Hi3)
    buildType(Tiger01337_Hi1)
    buildType(Tiger01337_Hi2)
})
