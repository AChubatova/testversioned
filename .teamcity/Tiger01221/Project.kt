package Tiger01221

import Tiger01221.buildTypes.*
import Tiger01221.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01221")
    name = "Tiger01221"

    vcsRoot(Tiger01221_cVCSroot)

    buildType(Tiger01221_Hi2)
    buildType(Tiger01221_Hi1)
    buildType(Tiger01221_Hi0)
    buildType(Tiger01221_Hi3)
})
