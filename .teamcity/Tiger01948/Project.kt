package Tiger01948

import Tiger01948.buildTypes.*
import Tiger01948.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01948")
    name = "Tiger01948"

    vcsRoot(Tiger01948_cVCSroot)

    buildType(Tiger01948_Hi2)
    buildType(Tiger01948_Hi1)
    buildType(Tiger01948_Hi0)
    buildType(Tiger01948_Hi3)
})
