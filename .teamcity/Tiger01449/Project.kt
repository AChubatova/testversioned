package Tiger01449

import Tiger01449.buildTypes.*
import Tiger01449.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01449")
    name = "Tiger01449"

    vcsRoot(Tiger01449_cVCSroot)

    buildType(Tiger01449_Hi1)
    buildType(Tiger01449_Hi2)
    buildType(Tiger01449_Hi0)
    buildType(Tiger01449_Hi3)
})
