package Tiger01222

import Tiger01222.buildTypes.*
import Tiger01222.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01222")
    name = "Tiger01222"

    vcsRoot(Tiger01222_cVCSroot)

    buildType(Tiger01222_Hi1)
    buildType(Tiger01222_Hi0)
    buildType(Tiger01222_Hi3)
    buildType(Tiger01222_Hi2)
})
