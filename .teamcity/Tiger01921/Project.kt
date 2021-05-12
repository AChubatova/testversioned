package Tiger01921

import Tiger01921.buildTypes.*
import Tiger01921.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01921")
    name = "Tiger01921"

    vcsRoot(Tiger01921_cVCSroot)

    buildType(Tiger01921_Hi2)
    buildType(Tiger01921_Hi3)
    buildType(Tiger01921_Hi0)
    buildType(Tiger01921_Hi1)
})
