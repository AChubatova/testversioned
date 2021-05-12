package Tiger0626

import Tiger0626.buildTypes.*
import Tiger0626.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0626")
    name = "Tiger0626"

    vcsRoot(Tiger0626_cVCSroot)

    buildType(Tiger0626_Hi1)
    buildType(Tiger0626_Hi2)
    buildType(Tiger0626_Hi0)
    buildType(Tiger0626_Hi3)
})
