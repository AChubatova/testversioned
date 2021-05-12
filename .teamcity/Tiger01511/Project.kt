package Tiger01511

import Tiger01511.buildTypes.*
import Tiger01511.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01511")
    name = "Tiger01511"

    vcsRoot(Tiger01511_cVCSroot)

    buildType(Tiger01511_Hi0)
    buildType(Tiger01511_Hi2)
    buildType(Tiger01511_Hi1)
    buildType(Tiger01511_Hi3)
})
