package Tiger0912

import Tiger0912.buildTypes.*
import Tiger0912.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0912")
    name = "Tiger0912"

    vcsRoot(Tiger0912_cVCSroot)

    buildType(Tiger0912_Hi3)
    buildType(Tiger0912_Hi2)
    buildType(Tiger0912_Hi1)
    buildType(Tiger0912_Hi0)
})
