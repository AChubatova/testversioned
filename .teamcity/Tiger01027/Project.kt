package Tiger01027

import Tiger01027.buildTypes.*
import Tiger01027.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01027")
    name = "Tiger01027"

    vcsRoot(Tiger01027_cVCSroot)

    buildType(Tiger01027_Hi3)
    buildType(Tiger01027_Hi2)
    buildType(Tiger01027_Hi1)
    buildType(Tiger01027_Hi0)
})
